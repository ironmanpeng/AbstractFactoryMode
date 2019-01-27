package com.puppy.pengtg.abstractfactorymode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mTest = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTest = (Button)findViewById(R.id.test);
        mTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarFactory factoryQ3 = new Q3Factory();
                factoryQ3.createTire().tire();
                factoryQ3.createEngine().engine();
                factoryQ3.createBrake().brake();

                System.out.println("-----------------------------");
                CarFactory factoryQ7 = new Q7Factory();
                factoryQ7.createTire().tire();
                factoryQ7.createEngine().engine();
                factoryQ7.createBrake().brake();

            }
        });
    }
}
