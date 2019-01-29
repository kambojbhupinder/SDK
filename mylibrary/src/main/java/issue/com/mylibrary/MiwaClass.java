package issue.com.mylibrary;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MiwaClass  {

    public MiwaClass(Context context)
    {
        Toast.makeText(context,"MiwaClass"+R.string.name,Toast.LENGTH_LONG).show();
    }

}
