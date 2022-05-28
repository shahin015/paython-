package com.wallpaperhd.ranningprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText subbjec,object,verb,oxv;
    String [] MainarrySubject= { "i","you","he"  };
    String [] Brb = { "go","listing","write"  };
   // String [] oxvert= { "am ","is","are","was","are" };
    String [] Ob= { "school","book","song"  };

    Button submit;
    String s=null;
    String s_subject=null;
    String sverb=null;
    String S_object=null;
    String sentence= "";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subbjec=findViewById(R.id.subject);
        verb=findViewById(R.id.verb);
        object=findViewById(R.id.oboject);

        //oxv=findViewById(R.id.oxb);
        textView=findViewById(R.id.tv_textview);

        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String subjects=subbjec.getText().toString().toLowerCase().trim();
               /// String oxV=oxv.getText().toString().toLowerCase();
                String brb=verb.getText().toString().toLowerCase().trim();
                String ob=object.getText().toString().toLowerCase().trim();
                sentence = subjects+" "+brb+" "+ob;

                for(int i = 0; i<MainarrySubject.length; i++){
                    if(subjects.equals(MainarrySubject[i])){
                        s_subject="i";


                        Toast.makeText(MainActivity.this, ""+s_subject, Toast.LENGTH_SHORT).show();
                    }
                }

//                for(int i = 0; i<oxvert.length; i++){
//                    if(oxV.equals(oxvert[i])){
//                        ss="t";
//
//                    }
//                }
////
                for(int i = 0; i<Brb.length; i++){
                    if(brb.equals(Brb[i])){
                        sverb="v";

                    }
                }


                for(int i = 0; i<Ob.length; i++){
                    if(ob.equals(Ob[i])){
                        S_object="o";

                    }
                }

                if (s_subject.contains("i")&&sverb.contains("v")&&S_object.contains("o")){

                    textView.setText(sentence +" Sentence is Correct");
                }else {
                    textView.setText(sentence+"Program carsh");
                }





            }
        });



    }
}