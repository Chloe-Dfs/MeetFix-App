package com.example.testandroid;

import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;

import java.sql.SQLOutput;

public class AjouterController {

    private AjouterFragment fragment;

    private Button OkBtn;
    private EditText Idtext;
    private EditText NameText;
    private EditText PlaceText;
    private EditText DateText;
    private EditText HourText;
    private EditText DurationText;
    private EditText OrgaText;
    private EditText CapacityText;
    private EditText DescText;
    private EditText ObligLabel;
    private EditText BringLabel;

    public void OkBtnListener(){
        if(OkBtn != null){
            OkBtn.setOnClickListener(view -> {
                Activite novActivite = new Activite(
                        Idtext.getText().toString(),
                        NameText.getText().toString(),
                        PlaceText.getText().toString(),
                        DateText.getText().toString(),
                        HourText.getText().toString(),
                        DurationText.getText().toString(),
                        OrgaText.getText().toString(),
                        Integer.parseInt(CapacityText.getText().toString()),
                        DescText.getText().toString(),
                        ObligLabel.getText().toString(),
                        BringLabel.getText().toString()
                        );
                System.out.println("New Activity Created ! :\n" + novActivite);
                //TODO faire en sorte de save la nouvelle activité dans le json (tant qu'a faire :} )
            });
        }
    }




}
