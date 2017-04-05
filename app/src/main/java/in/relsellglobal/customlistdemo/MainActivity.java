package in.relsellglobal.customlistdemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout)findViewById(R.id.contentLayout);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(linearLayout.getId(),new ItemFragment(),"item_fragment");
        ft.commit();


    }
}
