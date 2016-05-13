package id.co.telkomsigma.appintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btSubAct1;
    private Button btSubAct2;
    private Button btCallAct;
    private Button btSerialActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("App Intent");

        btSubAct1 = (Button) findViewById(R.id.btSubAct1);
        btSubAct2 = (Button) findViewById(R.id.btSubAct2);
        btCallAct = (Button) findViewById(R.id.btCallAct);
        btSerialActivity = (Button) findViewById(R.id.btSerialDataAct);

        btSubAct1.setOnClickListener(this);
        btSubAct2.setOnClickListener(this);
        btCallAct.setOnClickListener(this);
        btSerialActivity.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v.getId() == R.id.btSubAct1){
            intent = new Intent(MainActivity.this, SubActivity1.class);
        }else if (v.getId() == R.id.btSubAct2){
            intent = new Intent(MainActivity.this, SubActivity2.class);
            intent.putExtra(AppConstants.KEY_DATA, "DATA Main Activity");
        }else if (v.getId() == R.id.btCallAct){
            intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:081294533238"));
        }else if (v.getId() == R.id.btSerialDataAct){
            intent = new Intent(MainActivity.this, SerialDataActivity.class);
            DTOProfile dtoProfile = new DTOProfile();
            dtoProfile.setFirstName("Achmad");
            dtoProfile.setLastName("Fauzi");
            intent.putExtra(AppConstants.KEY_SERIAL_DATA, dtoProfile);
        }
        startActivity(intent);
    }

}
