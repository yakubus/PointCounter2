package yakubus.pl.pointcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spiner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spiner = (Spinner) findViewById(R.id.spinnerIloscGraczy);
        adapter = ArrayAdapter.createFromResource(this,R.array.PlayerNumber,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner.setAdapter(adapter);
    }

    public void click(View view) {
        switch (view.getId()){
            case R.id.buttonOK:
                Intent intent = new Intent(MainActivity.this, CounterActivity.class);
                startActivity(intent);
                break;
        }
    }
}
