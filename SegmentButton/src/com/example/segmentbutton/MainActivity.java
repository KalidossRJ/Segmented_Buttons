package com.example.segmentbutton;



import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnCheckedChangeListener {

	SegmentedRadioGroup segmentText;
	Toast mToast;
	
    @SuppressLint("ShowToast") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        segmentText = (SegmentedRadioGroup) findViewById(R.id.segment_text);
        segmentText.setOnCheckedChangeListener(this);
        mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
    }
    
    public void onCheckedChanged(RadioGroup group, int checkedId) {
		if (group == segmentText) {
			if (checkedId == R.id.button_one) {
				mToast.setText("Kalidoss");
				mToast.show();
			} else if (checkedId == R.id.button_two) {
				mToast.setText("Rajendran");
				mToast.show();
			} 
			
		} 
		}
	


}
