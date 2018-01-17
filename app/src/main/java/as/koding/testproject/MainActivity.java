package as.koding.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ja = (Button) findViewById(R.id.ja);
        ja.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("Svar", "Ja");
            }
        });

        final Button nei = (Button) findViewById(R.id.nei);
        nei.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("Svar", "Nei");
            }
        });

        final Button nyActivity = (Button) findViewById(R.id.nyActvity);
        nyActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();


    }
}
