package com.example.diak.beadando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private  int szam = 0;
    private Button noveles, csokkentes, reset;
    private TextView kiiratas;
    private int clickcounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noveles = (Button) findViewById(R.id.button_noveles);
        csokkentes = (Button) findViewById(R.id.button_csokken);
        reset = (Button) findViewById(R.id.button_reset);
        kiiratas = (TextView) findViewById(R.id.textView);

        noveles.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {

                    szam++;
                    clickcounter++;

                        if (clickcounter == 20)
                        {
                             Toast.makeText(MainActivity.this, "Unatkozol", Toast.LENGTH_SHORT).show();
                        }

                    kiiratas.setText("" + szam);
                }
            });


        csokkentes.setOnClickListener((new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                szam--;
                clickcounter++;

                    if (clickcounter == 20)
                    {
                        Toast.makeText(MainActivity.this, "Unatkozol", Toast.LENGTH_SHORT).show();
                    }

                kiiratas.setText("" + szam);
            }
        }));

        reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                szam=0;
                clickcounter = 0;
                kiiratas.setText(""+ szam);
            }
        });

    }
}
