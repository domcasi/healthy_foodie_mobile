package iics.casino.dominicmichael.healthy_foodie_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about_uspage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_uspage);

        Button behind = (Button) findViewById(R.id.button4);
        behind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent peepsbehind = new Intent(getApplicationContext(), peoplebehind.class);
                startActivity(peepsbehind);
            }
        });
    }
}
