package com.lazydroid.autoupdateapk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class ApkInstaller {

	private final Context ctx;

	/**
	 * Class providing APK installation functionalities.
	 */
	public ApkInstaller(Context ctx) {
		this.ctx = ctx;
	}

	/**
	 * Install or update APK from local file.
	 * 
	 * @param file
	 *            APK installation file
	 */
	public void update(String file) {
		Intent promptInstall = new Intent(Intent.ACTION_VIEW).setDataAndType(
				Uri.parse(file), "application/vnd.android.package-archive");
		ctx.startActivity(promptInstall);
	}
}