package id.co.telkomsigma.appintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SerialDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serial_data);

        DTOProfile dtoProfile = (DTOProfile) getIntent().getSerializableExtra(AppConstants.KEY_SERIAL_DATA);
        if (dtoProfile != null){
            EditText edtFirstName = (EditText) findViewById(R.id.edtFirstName);
            EditText edtLastName = (EditText) findViewById(R.id.edtLastName);

            edtFirstName.setText(dtoProfile.getFirstName());
            edtLastName.setText(dtoProfile.getLastName());
        }
    }
}
