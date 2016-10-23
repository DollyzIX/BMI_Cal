package game.bmical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
    }
    TextView textView4 = (TextView) findViewById(R.id.textView4);
    String s = getString(Result);
    textView4.setText(s);

    TextView textView6 = (TextView) findViewById(R.id.textView6);
    String text = getString(getMessage());
    textView4.setText(text);
}
