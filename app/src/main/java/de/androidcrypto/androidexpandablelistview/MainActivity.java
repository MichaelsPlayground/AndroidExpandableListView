package de.androidcrypto.androidexpandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * see tutorial https://www.geeksforgeeks.org/how-to-create-an-expandable-cardview-in-android/
     * and https://www.digitalocean.com/community/tutorials/android-expandablelistview-example-tutorial
     * and https://www.geeksforgeeks.org/simpleexpandablelistadapter-in-android-with-example/
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}