package com.dpingin.homeautomation.spice.request;

import android.net.Uri;
import android.util.Log;
import com.octo.android.robospice.request.springandroid.SpringAndroidSpiceRequest;

import java.net.URI;

public class SelectPatternRequest extends SpringAndroidSpiceRequest<Void>
{
	private static final String TAG = "SelectPatternRequest";

	private String patternName;

	public SelectPatternRequest(String patternName)
	{
		super(Void.class);
		this.patternName = patternName;
	}

	@Override
	public Void loadDataFromNetwork() throws Exception
	{
		Log.d(TAG, String.format("Selecting pattern: %s", patternName));

		String uriString = new Uri.Builder()
				.scheme("http")
				.encodedAuthority("192.168.1.11:8080")
				.appendPath("led")
				.appendPath("patterns")
				.appendPath(patternName)
				.build()
				.toString();

		return getRestTemplate().postForObject(new URI(uriString), null, Void.class);
	}

}
