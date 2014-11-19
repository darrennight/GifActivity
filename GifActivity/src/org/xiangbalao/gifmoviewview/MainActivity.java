package org.xiangbalao.gifmoviewview;

import org.xiangbalao.gifmoviewview.widget.GifMovieView;

import android.app.Activity;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		final GifMovieView gif1 = (GifMovieView) findViewById(R.id.gif1);
		gif1.setMovieResource(R.drawable.ma);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onGifClick(View v) {
		GifMovieView gif = (GifMovieView) v;
		gif.setPaused(!gif.isPaused());
	}

}
