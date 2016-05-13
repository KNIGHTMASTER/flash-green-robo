package id.co.telkomsigma.appintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        TextView textView = (TextView) findViewById(R.id.tvData);
        String data = getIntent().getStringExtra(AppConstants.KEY_DATA);
        textView.setText(data);
    }
}
