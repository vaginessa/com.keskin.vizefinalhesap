package com.keskin.vizefinalhesap;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.graphics.*;

public class MainActivity extends Activity 
{
    @Override
	
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
    }
	public void Hesapla(View view) {
		LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
		
		//oranlar 
		EditText voran = (EditText) findViewById(R.id.voran);
		EditText foran = (EditText) findViewById(R.id.foran);
		EditText ooran = (EditText) findViewById(R.id.ooran);
		//notlar
		EditText vnot = (EditText) findViewById(R.id.vnot);
		EditText fnot = (EditText) findViewById(R.id.fnot);
		EditText onot = (EditText) findViewById(R.id.onot);
		
		//Oran integer 
		
		int vo = Integer.parseInt(voran.getText().toString());
		int fo = Integer.parseInt(foran.getText().toString());
		int oo=Integer.parseInt(ooran.getText().toString());
		
		//Not integer
		int vn = Integer.parseInt(vnot.getText().toString());
		int fn = Integer.parseInt(fnot.getText().toString());
		int on = Integer.parseInt(onot.getText().toString());
		
		TextView sonuc = (TextView) findViewById(R.id.sonuc);
		//Katkı hesabı
		int vkat= vo*vn;
		int fkat= fo*fn;
		int okat =0;
		int ort = 0;
		if (oo ==0){
		ort = (vkat+fkat)/100;
		}
		else{
	    okat = oo*on;
	    ort= (vkat+fkat+okat)/100;
	    }
		String durum = "";
		String harf = "";
		String harf2 = "";
		String harfx = "";
		String yazi = "";
		String emoji ="";
		String ifade ="\nHocanın verdiği not:";
		//Geçme durumu
		
		if (ort < 60){
		  durum = "Sorumlu GEÇTİN";
		  layout.setBackgroundColor(Color.MAGENTA);
		}
		if (ort < 50){
		  durum = "KALDIN";
		  layout.setBackgroundColor(Color.RED);
		}
		if (ort > 60){
	      durum = "GEÇTİN";
		  layout.setBackgroundColor(Color.BLUE);
		  ifade ="\nAldığın not:";
		}
		//Harf durumu
		if (ort >= 0){
			harf = "F1";
			harf2="FF";
			emoji="😭";
		}
		if (ort > 39){
			harf = "E";
			harf2="FD";
			emoji="😱";
		}
		if (ort > 49){
			harf = "D2";
			harf2= "DD";
			emoji="😶";
		}
		if (ort > 54){
			harf = "D1";
			harf2="DD";
			emoji="😐";
		}
		if (ort > 59){
			harf ="C2";
			harf2="DC";
			emoji="🤔";
		}
		if (ort > 64){
			harf ="C1";
			harf2="DC";
			emoji="😏";
		}
		if (ort > 69){
			harf = "B2";
			harf2="CC";
			emoji="😮";
		}
		if (ort > 74){
			harf = "B1";
			harf2="CB";
			emoji="🙂";
		}
		if (ort > 79){
			harf = "A2";
			harf2="BB";
			emoji="🤗";
		}
		if (ort > 84){
			harf2="BA";
			emoji="😘";
		}
		if (ort > 89){
			harf = "A1";
			harf2="AA";
			emoji="😎";
		}
		if (ort > 100){
			yazi="Durum: Bir yanlışlık var. Notun "+ ort + " olamaz";
		}
		else{
			if ((oo + vo + fo)  != 100){
				yazi="Durum: Oranlarda sıkıntı var Toplam oran 100 değil";
			}
			else{
		//harf sistemi ayarı
	    harfx=harf;
		//yazının hazırlanması
		yazi="Durum: " +harfx + " ile " + durum + ifade + ort;
		yazi=yazi+"\nŞu anki Halin:"+emoji;
		if (fn==0){
			yazi = yazi + "\n\nFinalden:";
			yazi = yazi + "\n"+ "E  için en az "+((40 - ort)*100  / fo) ;
			yazi = yazi + "\n"+ "D2 için en az "+((50 - ort)*100  / fo) ;
			yazi = yazi + "\n"+ "D1 için en az "+((55 - ort)*100  / fo) ;
			yazi = yazi + "\n"+ "C2 için en az "+((60 - ort)*100  / fo) ;
			yazi = yazi + "\n"+ "C1 için en az "+((65 - ort)*100  / fo) ;
			yazi = yazi + "\n"+ "B2 için en az "+((70 - ort)*100  / fo) ;
			yazi = yazi + "\n"+ "B1 için en az "+((75 - ort)*100  / fo) ;
			yazi = yazi + "\n"+ "A2 için en az "+((80 - ort)*100  / fo) ;
			yazi = yazi + "\n"+ "A1 için en az "+((90 - ort)*100  / fo) ;
			
		}
		if (on==0 & oo  > 0){
			yazi = yazi + "\n\nÖdevden:";
			yazi = yazi + "\n"+ "E  için en az "+((40 - ort)*100  / oo) ;
			yazi = yazi + "\n"+ "D2 için en az "+((50 - ort)*100  / oo) ;
			yazi = yazi + "\n"+ "D1 için en az "+((55 - ort)*100  / oo) ;
			yazi = yazi + "\n"+ "C2 için en az "+((60 - ort)*100  / oo) ;
			yazi = yazi + "\n"+ "C1 için en az "+((65 - ort)*100  / oo) ;
			yazi = yazi + "\n"+ "B2 için en az "+((70 - ort)*100  / oo) ;
			yazi = yazi + "\n"+ "B1 için en az "+((75 - ort)*100  / oo) ;
			yazi = yazi + "\n"+ "A2 için en az "+((80 - ort)*100  / oo) ;
			yazi = yazi + "\n"+ "A1 için en az "+((90 - ort)*100  / oo) ;
			
		}
		}
		sonuc.setText(yazi);
		}
	}
}
