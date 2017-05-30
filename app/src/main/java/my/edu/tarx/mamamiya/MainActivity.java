package my.edu.tarx.mamamiya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //mODULE LEVEL ARIABLE
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Display UI
        //R = resource class
        setContentView(R.layout.activity_main);

        textViewMessage = (TextView) findViewById(R.id.textViewMessage);

    }

    public void showMessage(View v){
        textViewMessage.setText("Hi my name is mamamiya");

    }

    public void restoreMessage(View v){
        textViewMessage.setText(getString(R.string.app_name));

    }
}
