package com.androidParty.lastnightparty;

public class StringUtilities
{
	public static boolean isNullOrEmpty(String input)
	{
		if (input == null || input.isEmpty())
		{
			return true;
		}
		return false;
	}
}
