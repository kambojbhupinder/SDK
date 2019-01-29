package issue.com.miwaaarfileissue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import issue.com.miwa.MiwaMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MiwaMainActivity miwaMainActivity=new MiwaMainActivity(this);
    }
}
