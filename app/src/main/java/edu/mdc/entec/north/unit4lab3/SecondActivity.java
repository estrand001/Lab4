package edu.mdc.entec.north.unit4lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
        private static final String TOTAL_COUNT = "total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    public void showRandomNumber() {

        int receivedCount = getIntent().getIntExtra(TOTAL_COUNT,  0);
        Random random = new Random();
        int randomInt = 0;
        if(receivedCount > 0 ){
            random.nextInt(receivedCount);
        }


        TextView randomView = (TextView) findViewById(R.id.textview_random);
        TextView headingView = (TextView) findViewById(R.id.textView2);

        headingView.setText( getString(R.string.random_heading, receivedCount));

        randomView.setText ( Integer.toString(randomInt));

    }

}
