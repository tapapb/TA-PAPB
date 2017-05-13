package com.studio.vokasi.tudhkar.composer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.ViewGroup;

import com.studio.vokasi.tudhkar.R;

public class MenuDoa extends AppCompatActivity
		implements NavigationView.OnNavigationItemSelectedListener {
	Toolbar toolbar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_doa);
		toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setTitle("Kategori Doa");

		FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
						.setAction("Action", null).show();
			}
		});
		navigasi();
		FragmentKategori();
	}

	public void ibSehari(View view) {
		Intent i = new Intent(this,ListKategori.class);
		i.putExtra("kategori","Doa Sehari-hari");
		startActivity(i);
	}

	public void ibSholat(View view) {
		Intent i = new Intent(this,ListKategori.class);
		i.putExtra("kategori","Doa Sholat");
		startActivity(i);
	}

	public void ibDzikir(View view) {
		Intent i = new Intent(this,ListKategori.class);
		i.putExtra("kategori","Doa Dzikir");
		startActivity(i);
	}

	public void ibSurat(View view) {
		Intent i = new Intent(this,ListKategori.class);
		i.putExtra("kategori","Surat Pendek");
		startActivity(i);
	}

	public void navigasi(){
		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
				this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
		drawer.setDrawerListener(toggle);
		toggle.syncState();

		NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(this);
	}
	public void toolbarCustom(){
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}
	@Override
	public void onBackPressed() {
		Dialog();
	}

	//dialog untuk keluar
	public void Dialog() {

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Keluar Dari Aplikasi ?");
		builder.setPositiveButton("Batal", new
				DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int arg1) {
						// TODO Auto-generated method stub
						dialog.dismiss();
					}
				});
		builder.setNegativeButton("Ya", new
				DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						finishAffinity();
					}
				});
		builder.create().show();
	}
	//-----------------------------------------
	public void FragmentKategori(){
		Fragment_Kategori fragmentKategori = new Fragment_Kategori();
		FragmentManager fragment_developer = getFragmentManager();
		// Creating a fragment transaction
		FragmentTransaction ft = fragment_developer.beginTransaction();
		// Adding a fragment to the fragment transaction
		ft.replace(R.id.content_menu_utama, fragmentKategori);
		// Committing the transaction
		ft.commit();
	}
	public void FragmentPengingat(){
		Fragment_Pengingat fragmentKategori = new Fragment_Pengingat();
		FragmentManager fragment_developer = getFragmentManager();
		// Creating a fragment transaction
		FragmentTransaction ft = fragment_developer.beginTransaction();
		// Adding a fragment to the fragment transaction
		ft.replace(R.id.content_menu_utama, fragmentKategori);
		// Committing the transaction
		ft.commit();
	}
	public void FragmentFavorit(){
		Fragment_Favorit fragmentKategori = new Fragment_Favorit();
		FragmentManager fragment_developer = getFragmentManager();
		// Creating a fragment transaction
		FragmentTransaction ft = fragment_developer.beginTransaction();
		// Adding a fragment to the fragment transaction
		ft.replace(R.id.content_menu_utama, fragmentKategori);
		// Committing the transaction
		ft.commit();
	}
	public void FragmentManager(){
		Fragment_Manager fragmentKategori = new Fragment_Manager();
		FragmentManager fragment_developer = getFragmentManager();
		// Creating a fragment transaction
		FragmentTransaction ft = fragment_developer.beginTransaction();
		// Adding a fragment to the fragment transaction
		ft.replace(R.id.content_menu_utama, fragmentKategori);
		// Committing the transaction
		ft.commit();
	}
	public void FragmentBantuan(){
		Fragment_Bantuan fragmentKategori = new Fragment_Bantuan();
		FragmentManager fragment_developer = getFragmentManager();
		// Creating a fragment transaction
		FragmentTransaction ft = fragment_developer.beginTransaction();
		// Adding a fragment to the fragment transaction
		ft.replace(R.id.content_menu_utama, fragmentKategori);
		// Committing the transaction
		ft.commit();
	}
	public void FragmentTentang(){
		Fragment_Tentang fragmentdeveloper = new Fragment_Tentang();
		FragmentManager fragment_developer = getFragmentManager();
		// Creating a fragment transaction
		FragmentTransaction ft = fragment_developer.beginTransaction();
		// Adding a fragment to the fragment transaction
		ft.replace(R.id.content_menu_utama, fragmentdeveloper);
		// Committing the transaction
		ft.commit();
	}
	//-------------------------------------------
	@SuppressWarnings("StatementWithEmptyBody")
	@Override
	public boolean onNavigationItemSelected(MenuItem item) {
		// Handle navigation view item clicks here.
		int id = item.getItemId();

		if (id == R.id.nav_kategori) {
			getSupportActionBar().setTitle("Kategori Doa");
			toolbarCustom();
			navigasi();
			FragmentKategori();
		} else if (id == R.id.nav_pengingat) {
			getSupportActionBar().setTitle("Pengingat");
			toolbarCustom();
			navigasi();
			FragmentPengingat();
		} else if (id == R.id.nav_favorit) {
			getSupportActionBar().setTitle("Favorit");
			toolbarCustom();
			navigasi();
			FragmentFavorit();
		} else if (id == R.id.nav_manage) {
			getSupportActionBar().setTitle("Manager");
			toolbarCustom();
			navigasi();
			FragmentManager();
		} else if (id == R.id.nav_bantuan) {
			getSupportActionBar().setTitle("Bantuan");
			toolbarCustom();
			navigasi();
			FragmentBantuan();
		} else if (id == R.id.nav_tentang) {
			getSupportActionBar().setTitle("Tentang");
			toolbarCustom();
			navigasi();
			FragmentTentang();
		}

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawer.closeDrawer(GravityCompat.START);
		return true;
	}

	//------------------------------------------------------- class fragnent
	public class Fragment_Kategori extends Fragment {
		@Override
		public View onCreateView(LayoutInflater inflater,
		                         ViewGroup container, Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment_kategori, container, false);
			return v;
		}

	}
	public class Fragment_Pengingat extends Fragment {
		@Override
		public View onCreateView(LayoutInflater inflater,
		                         ViewGroup container, Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment_pengingat, container, false);
			return v;
		}

	}
	public class Fragment_Favorit extends Fragment {
		@Override
		public View onCreateView(LayoutInflater inflater,
		                         ViewGroup container, Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment_favorit, container, false);
			return v;
		}

	}
	public class Fragment_Manager extends Fragment {
		@Override
		public View onCreateView(LayoutInflater inflater,
		                         ViewGroup container, Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment_manager, container, false);
			return v;
		}

	}
	public class Fragment_Bantuan extends Fragment {
		@Override
		public View onCreateView(LayoutInflater inflater,
		                         ViewGroup container, Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment_bantuan, container, false);
			return v;
		}

	}
	public class Fragment_Tentang extends Fragment {
		@Override
		public View onCreateView(LayoutInflater inflater,
		                         ViewGroup container, Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment_tentang, container, false);
			return v;
		}

	}
}
