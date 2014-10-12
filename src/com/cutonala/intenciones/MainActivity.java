package com.cutonala.intenciones;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void btnWeb(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fsf.org/es"));
		startActivity(intent);
	}
	
	public void btnMaps(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.656313,-0.877351"));
		startActivity(intent);
	}
	
	public void btnFoto(View view) {
		Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
		startActivity(intent);
	}
	
	public void btnLlamada(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:962849347"));
		startActivity(intent);
	}
	
	public void btnCorreo(View view) {
		Intent intent = new Intent(Intent.ACTION_SEND) ;
		intent. setType (" text,/plain ") ;
		intent.putExtra(Intent.EXTRA_SUBJECT, "asunto");
		intent.putExtra(Intent.EXTRA_TEXT, "texto del correo");
		intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "jtomas@upv.es" });
		startActivity(intent) ;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
