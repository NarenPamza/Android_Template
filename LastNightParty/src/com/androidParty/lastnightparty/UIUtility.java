package com.androidParty.lastnightparty;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class UIUtility
{
	public static void showOkAlertDialog(Activity activity, String message)
	{
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				activity);
		alertDialogBuilder.setMessage(message);
		alertDialogBuilder.setPositiveButton("OK",
				new DialogInterface.OnClickListener()
				{
					@Override
					public void onClick(DialogInterface dialog, int arg1)
					{
						dialog.cancel();
					}
				});
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
	}
}
