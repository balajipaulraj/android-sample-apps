package com.ooyala.sample.lists;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ooyala.sample.R;
import com.ooyala.sample.players.SsaiPlayerActivity;
import com.ooyala.sample.utils.PlayerSelectionOption;

import java.util.LinkedHashMap;
import java.util.Map;


public class SsaiListActivity extends Activity implements AdapterView.OnItemClickListener {
    private static final int LOAD_REACT_BUNDLE_PERMISSION_REQ_CODE = 666;

    public final static String getName() {
        return "SSAI Playback";
    }

    private static Map<String, PlayerSelectionOption> selectionMap;
    ArrayAdapter<String> selectionAdapter;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getName());

        selectionMap = new LinkedHashMap<String, PlayerSelectionOption>();
        selectionMap.put("SSAI Embed Code", new PlayerSelectionOption("ltZ3l5YjE6lUAvBdflvcDQ-zti8q8Urd", "RpOWUyOq86gFq-STNqpgzhzIcXHV", "http://www.ooyala.com", SsaiPlayerActivity.class));
        selectionMap.put("SSAI Live", new PlayerSelectionOption("lkb2cyZjE6wp94YSGIEjm6Em1yH0P3zT", "RpOWUyOq86gFq-STNqpgzhzIcXHV", "http://www.ooyala.com", SsaiPlayerActivity.class));
        setContentView(R.layout.list_activity_layout);

        //Create the adapter for the ListView
        selectionAdapter = new ArrayAdapter<String>(this, R.layout.list_activity_list_item);
        for(String key : selectionMap.keySet()) {
            selectionAdapter.add(key);
        }
        selectionAdapter.notifyDataSetChanged();

        //Load the data into the ListView
        ListView selectionListView = (ListView) findViewById(R.id.mainActivityListView);
        selectionListView.setAdapter(selectionAdapter);
        selectionListView.setOnItemClickListener(this);

        //Force request android.permission.SYSTEM_ALERT_WINDOW
        // that is ignored in Manifest on Marshmallow devices.
        // Can be used if necessary to use native-skin source code
//    if(Build.VERSION_CODES.M == Build.VERSION.SDK_INT) {
//      showDevOptionsDialog();
//    }
    }

    private void showDevOptionsDialog() {
        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
        startActivityForResult(intent, LOAD_REACT_BUNDLE_PERMISSION_REQ_CODE);
    }


    @Override
    public void onItemClick(AdapterView<?> l, View v, int pos, long id) {
        PlayerSelectionOption selection =  selectionMap.get(selectionAdapter.getItem(pos));
        Class<? extends Activity> selectedClass = selection.getActivity();

        //Launch the correct activity with the embed code as an extra
        Intent intent = new Intent(this, selectedClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        intent.putExtra("embed_code", selection.getEmbedCode());
        intent.putExtra("selection_name", selectionAdapter.getItem(pos));
        intent.putExtra("pcode", selection.getPcode());
        intent.putExtra("domain", selection.getDomain());
        startActivity(intent);
        return;
    }
}