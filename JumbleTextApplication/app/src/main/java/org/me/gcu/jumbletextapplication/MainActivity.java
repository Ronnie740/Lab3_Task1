package org.me.gcu.jumbletextapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button jumble;
    private EditText textEntry;
    private TextView textView4;
    private EditText length;
    private EditText width;
    private Button area;
    private TextView totalArea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jumble = (Button)findViewById(R.id.jumble);
        textEntry = (EditText)findViewById(R.id.textEntry);
        jumble.setOnClickListener(this);
        textEntry.setFocusable(true);
        textView4 = (TextView)findViewById(R.id.textView4);
        area = (Button)findViewById(R.id.area);
        area.setOnClickListener(this);
        length = (EditText)findViewById(R.id.length);
        width = (EditText) findViewById(R.id.width);
        totalArea = (TextView) findViewById(R.id.totalArea);
    }

    @Override
    public void onClick(View v)
    {
        //String inputText = String.valueOf(textEntry.getText());
        // Check for jumble button.
        if (v == jumble)
        {
            ShuffleStringExample shuffle = new ShuffleStringExample();
            String jumbledText = shuffle.Jumble(String.valueOf(textEntry.getText()));
            textView4.setText(jumbledText);
        }

        if (v == area){
            Area calc = new Area();
            double x  =  Double.parseDouble(String.valueOf(length.getText()));
            System.out.println("Length: "+length.getText());
            System.out.println("X: "+ x);
            double y  =  Double.parseDouble(String.valueOf(width.getText()));
            double a = calc.area(x,y);
            totalArea.setText(String.valueOf(a));
            System.out.println(a);
        }
    }// End of onClick
//    public void onConfigurationChanges(Configuration newConfig){
//        Configuration c = getResources().getConfiguration();
//        if(c.orientation == Configuration.ORIENTATION_PORTRAIT){
//        }
//    }
}