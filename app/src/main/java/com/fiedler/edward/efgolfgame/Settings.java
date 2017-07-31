package com.fiedler.edward.efgolfgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by Edward on 11/16/2016.
 */

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        ToggleButton bToggle = (ToggleButton) findViewById(R.id.toggleButton2);


        Button bSave = (Button) findViewById(R.id.buttonSave);
        Button bCancel = (Button) findViewById(R.id.buttonCancel);

        View.OnClickListener listenerSaveButton =
                new View.OnClickListener() {
                    public void onClick(View v) {
                        ToggleButton bToggle = (ToggleButton) findViewById(R.id.toggleButton2);

                        CharSequence response = bToggle.getText().toString();
                        Intent data = new Intent();
                        data.putExtra("Response", response);
                        setResult(RESULT_OK, data);
                        finish();

                    }
                };

        View.OnClickListener listenerCancelButton =
                new View.OnClickListener() {
                    public void onClick(View v) {
                        setResult(RESULT_CANCELED);
                        finish();
                    }
                };

        bSave.setOnClickListener(listenerSaveButton);
        bCancel.setOnClickListener(listenerCancelButton);
    }
}
