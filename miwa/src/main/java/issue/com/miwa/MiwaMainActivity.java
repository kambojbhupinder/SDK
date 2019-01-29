package issue.com.miwa;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import issue.com.mylibrary.MiwaClass;

public class MiwaMainActivity {

    public MiwaMainActivity(Context context)
    {
        Toast.makeText(context,"MiwaMainActivity",Toast.LENGTH_LONG).show();
        FragmentActivity fragmentActivity=(FragmentActivity)context;
        MiwaClass miwaClass=new MiwaClass(fragmentActivity);
    }

}
