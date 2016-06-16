package perfect_apps.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.textView)).setText(getMsgFromJni());
    }

    // new code
    static {
        System.loadLibrary("hellojni");
    }
    public native String getMsgFromJni();
}
