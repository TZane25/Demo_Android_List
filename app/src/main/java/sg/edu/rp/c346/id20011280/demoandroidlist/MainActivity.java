package sg.edu.rp.c346.id20011280.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    ArrayList<AndroidVersion> alAndroidversions;

    ArrayAdapter<AndroidVersion>  aaAndroidversions;

    CustomAdapter Adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        alAndroidversions = new ArrayList<>();

        //AndroidVersion item = new AndroidVersion("Pie", "9.0");
        //alAndroidversions.add(item);
        //item = new AndroidVersion("Oreo", "8.0 - 8.1");
       // alAndroidversions.add(item);
        //item = new AndroidVersion("Nougat", "7.0 - 7.1.2");
        //alAndroidversions.add(item);


        alAndroidversions.add(new AndroidVersion("nougat","7.0"));
        alAndroidversions.add(new AndroidVersion("pie","9.0"));
        alAndroidversions.add(new AndroidVersion("marshmellow","8.0"));

       // aaAndroidversions = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,alAndroidversions);
        //lv.setAdapter(aaAndroidversions);

        Adapter = new CustomAdapter(this, R.layout.row, alAndroidversions);
        lv.setAdapter(Adapter);















    }
}