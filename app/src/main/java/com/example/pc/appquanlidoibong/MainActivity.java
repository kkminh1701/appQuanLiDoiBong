package com.example.pc.appquanlidoibong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.pc.appquanlidoibong.com.adapter.AdapterDoiBong;
import com.example.pc.appquanlidoibong.com.models.DoiBong;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDoiBong;
    ArrayList<DoiBong> dsDoiBong;
    AdapterDoiBong adapterDoiBong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        lvDoiBong = (ListView) findViewById(R.id.lvDoiBong);

        dsDoiBong = new ArrayList<>();




        addDoiBong();
        adapterDoiBong = new AdapterDoiBong(MainActivity.this, R.layout.items, dsDoiBong);
        lvDoiBong.setAdapter(adapterDoiBong);

    }

    private void addDoiBong() {
        dsDoiBong.add(new DoiBong(22,R.drawable.mc,"Manchester City", "HLV: Pep Guardiola", "Xếp Hạng: 1" ));
        dsDoiBong.add(new DoiBong(20,R.drawable.man,"Manchester United", "HLV: Mourinho", "Xếp Hạng: 2" ));
        dsDoiBong.add(new DoiBong(17,R.drawable.chelsea,"Chelsea", "HLV: Antonio Conte", "Xếp Hạng: 3" ));
        dsDoiBong.add(new DoiBong(15,R.drawable.everton,"Everton", "HLV: Ronald Koeman", "Xếp Hạng: 4" ));
        dsDoiBong.add(new DoiBong(13,R.drawable.arsenal,"Arsenal", "HLV: Arsène Wenger", "Xếp Hạng: 5" ));
        dsDoiBong.add(new DoiBong(10,R.drawable.leicester,"Leicester City", "HLV: Shakespeare", "Xếp Hạng: 6" ));
        dsDoiBong.add(new DoiBong(9,R.drawable.westbrom,"West Brom", "HLV: Tony Pulis", "Xếp Hạng: 7" ));
        dsDoiBong.add(new DoiBong(8,R.drawable.watford,"Watford", "HLV: Marco Silva", "Xếp Hạng: 8" ));
        dsDoiBong.add(new DoiBong(8,R.drawable.newcastle,"New Castle", "HLV: Rafael Benítez", "Xếp Hạng: 9" ));
        dsDoiBong.add(new DoiBong(4,R.drawable.huddersfield,"Huddersfield", "HLV: David Wagner", "Xếp Hạng: 10" ));
        dsDoiBong.add(new DoiBong(3,R.drawable.southampton,"Southampton", "HLV: Mauricio Pellegrino", "Xếp Hạng: 11" ));
        dsDoiBong.add(new DoiBong(3,R.drawable.swansea,"Swansea", "HLV: Paul Clement", "Xếp Hạng: 12" ));
        dsDoiBong.add(new DoiBong(3,R.drawable.westham,"Westham", "HLV: Slaven Bilić", "Xếp Hạng: 13" ));





    }
}
