package com.tectonica.geo.server;

import gnu.trove.map.hash.TDoubleObjectHashMap;

import com.tectonica.geo.common.model.DistTime;

public class DistTimeMatrix
{
	private TDoubleObjectHashMap<TDoubleObjectHashMap<TDoubleObjectHashMap<TDoubleObjectHashMap<DistTime>>>> data = new TDoubleObjectHashMap<>();

	public DistTime get(double fromLat, double fromLng, double toLat, double toLng)
	{
		TDoubleObjectHashMap<TDoubleObjectHashMap<TDoubleObjectHashMap<DistTime>>> fLat = data.get(fromLat);
		if (fLat == null)
			return null;
		TDoubleObjectHashMap<TDoubleObjectHashMap<DistTime>> fLng = fLat.get(fromLng);
		if (fLng == null)
			return null;
		TDoubleObjectHashMap<DistTime> tLat = fLng.get(toLat);
		if (tLat == null)
			return null;
		return tLat.get(toLng);
	}

	public void put(double fromLat, double fromLng, double toLat, double toLng, DistTime distTime)
	{
		boolean created = false;

		TDoubleObjectHashMap<TDoubleObjectHashMap<TDoubleObjectHashMap<DistTime>>> fLat = data.get(fromLat);
		if (fLat == null)
		{
			data.put(fromLat, fLat = new TDoubleObjectHashMap<>());
			created = true;
		}

		TDoubleObjectHashMap<TDoubleObjectHashMap<DistTime>> fLng = created ? null : fLat.get(fromLng);
		if (fLng == null)
		{
			fLat.put(fromLng, fLng = new TDoubleObjectHashMap<>());
			created = true;
		}

		TDoubleObjectHashMap<DistTime> tLat = created ? null : fLng.get(toLat);
		if (tLat == null)
			fLng.put(toLat, tLat = new TDoubleObjectHashMap<>());

		tLat.put(toLng, distTime);
	}
}
