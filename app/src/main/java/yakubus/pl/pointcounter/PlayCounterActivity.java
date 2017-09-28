package yakubus.pl.pointcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PlayCounterActivity extends AppCompatActivity {


    TextView textViewPoint1;
    TextView textViewPoint2;
    TextView textViewPoint3;
    TextView textViewPoint4;
    TextView textViewPoint5;
    TextView textViewPoint6;
    TextView textViewPoint7;
    TextView textViewPoint8;


    EditText editTextAddPoint1;
    EditText editTextAddPoint2;
    EditText editTextAddPoint3;
    EditText editTextAddPoint4;
    EditText editTextAddPoint5;
    EditText editTextAddPoint6;
    EditText editTextAddPoint7;
    EditText editTextAddPoint8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_counter);
        textViewPoint1 = (TextView)findViewById(R.id.PointsPlayer1textView);
        textViewPoint2 = (TextView)findViewById(R.id.PointsPlayer2textView);
        textViewPoint3 = (TextView)findViewById(R.id.PointsPlayer3textView);
        textViewPoint4 = (TextView)findViewById(R.id.PointsPlayer4textView);
        textViewPoint5 = (TextView)findViewById(R.id.PointsPlayer5textView);
        textViewPoint6 = (TextView)findViewById(R.id.PointsPlayer6textView);
        textViewPoint7 = (TextView)findViewById(R.id.PointsPlayer7textView);
        textViewPoint8 = (TextView)findViewById(R.id.PointsPlayer8textView);

        editTextAddPoint1 = (EditText)findViewById(R.id.AddPoint1editText);
        editTextAddPoint2 = (EditText)findViewById(R.id.AddPoint2editText);
        editTextAddPoint3 = (EditText)findViewById(R.id.AddPoint3editText);
        editTextAddPoint4 = (EditText)findViewById(R.id.AddPoint4editText);
        editTextAddPoint5 = (EditText)findViewById(R.id.AddPoint5editText);
        editTextAddPoint6 = (EditText)findViewById(R.id.AddPoint6editText);
        editTextAddPoint7 = (EditText)findViewById(R.id.AddPoint7editText);
        editTextAddPoint8 = (EditText)findViewById(R.id.AddPoint8editText);


    }

    public void click(View view) {
        switch (view.getId()) {
           // Clicked "+" button
            case R.id.Plus1button:
               textViewPoint1.setText(Integer.toString(Integer.parseInt(textViewPoint1.getText().toString()) + 1));
                break;
            case R.id.Plus2button:
                textViewPoint2.setText(Integer.toString(Integer.parseInt(textViewPoint2.getText().toString()) + 1));
                break;
            case R.id.Plus3button:
                textViewPoint3.setText(Integer.toString(Integer.parseInt(textViewPoint3.getText().toString()) + 1));
                break;
            case R.id.Plus4button:
                textViewPoint4.setText(Integer.toString(Integer.parseInt(textViewPoint4.getText().toString()) + 1));
                break;
            case R.id.Plus5button:
                textViewPoint5.setText(Integer.toString(Integer.parseInt(textViewPoint5.getText().toString()) + 1));
                break;
            case R.id.Plus6button:
                textViewPoint6.setText(Integer.toString(Integer.parseInt(textViewPoint6.getText().toString()) + 1));
                break;
            case R.id.Plus7button:
                textViewPoint7.setText(Integer.toString(Integer.parseInt(textViewPoint7.getText().toString()) + 1));
                break;
            case R.id.Plus8button:
                textViewPoint8.setText(Integer.toString(Integer.parseInt(textViewPoint8.getText().toString()) + 1));
                break;
            // Clicked "-" button
            case R.id.Minus1button:
                textViewPoint1.setText(Integer.toString(Integer.parseInt(textViewPoint1.getText().toString()) - 1));
                break;
            case R.id.Minus2button:
                textViewPoint2.setText(Integer.toString(Integer.parseInt(textViewPoint2.getText().toString()) - 1));
                break;
            case R.id.Minus3button:
                textViewPoint3.setText(Integer.toString(Integer.parseInt(textViewPoint3.getText().toString()) - 1));
                break;
            case R.id.Minus4button:
                textViewPoint4.setText(Integer.toString(Integer.parseInt(textViewPoint4.getText().toString()) - 1));
                break;
            case R.id.Minus5button:
                textViewPoint5.setText(Integer.toString(Integer.parseInt(textViewPoint5.getText().toString()) - 1));
                break;
            case R.id.Minus6button:
                textViewPoint6.setText(Integer.toString(Integer.parseInt(textViewPoint6.getText().toString()) - 1));
                break;
            case R.id.Minus7button:
                textViewPoint7.setText(Integer.toString(Integer.parseInt(textViewPoint7.getText().toString()) - 1));
                break;
            case R.id.Minus8button:
                textViewPoint8.setText(Integer.toString(Integer.parseInt(textViewPoint8.getText().toString()) - 1));
                break;
            // Clicked add point
            case R.id.Add1button:
                if(editTextAddPoint1.getText().toString()!="") {
                    textViewPoint1.setText(Integer.toString(Integer.parseInt(textViewPoint1.getText().toString()) + Integer.parseInt(editTextAddPoint1.getText().toString())));
                }
                    break;
            case R.id.Add2button:
                if(editTextAddPoint2.getText().toString()!="") {
                    textViewPoint2.setText(Integer.toString(Integer.parseInt(textViewPoint2.getText().toString()) + Integer.parseInt(editTextAddPoint2.getText().toString())));
                }
                    break;
            case R.id.Add3button:
                if(editTextAddPoint3.getText().toString()!=""){
                    textViewPoint3.setText(Integer.toString(Integer.parseInt(textViewPoint3.getText().toString()) + Integer.parseInt(editTextAddPoint3.getText().toString())));
                }
                    break;
            case R.id.Add4button:
                if(editTextAddPoint4.getText().toString()!="") {
                    textViewPoint4.setText(Integer.toString(Integer.parseInt(textViewPoint4.getText().toString()) + Integer.parseInt(editTextAddPoint4.getText().toString())));
                }
                    break;
            case R.id.Add5button:
                if(editTextAddPoint5.getText().toString()!="") {
                    textViewPoint5.setText(Integer.toString(Integer.parseInt(textViewPoint5.getText().toString()) + Integer.parseInt(editTextAddPoint5.getText().toString())));
                }
                    break;
            case R.id.Add6button:
                if(editTextAddPoint6.getText().toString()!="") {
                    textViewPoint6.setText(Integer.toString(Integer.parseInt(textViewPoint6.getText().toString()) + Integer.parseInt(editTextAddPoint6.getText().toString())));
                }
                    break;
            case R.id.Add7button:
                if(editTextAddPoint7.getText().toString()!="") {
                    textViewPoint7.setText(Integer.toString(Integer.parseInt(textViewPoint7.getText().toString()) + Integer.parseInt(editTextAddPoint7.getText().toString())));
                }
                    break;
            case R.id.Add8button:
                if(editTextAddPoint8.getText().toString()!="") {
                    textViewPoint8.setText(Integer.toString(Integer.parseInt(textViewPoint8.getText().toString()) + Integer.parseInt(editTextAddPoint8.getText().toString())));
                }
                    break;
        }
    }
}
