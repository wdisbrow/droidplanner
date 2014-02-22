package org.droidplanner.drone.variables.missionD.waypoints;

import java.util.List;

import org.droidplanner.drone.variables.mission.Mission;
import org.droidplanner.drone.variables.missionD.MissionItemD;
import org.droidplanner.helpers.units.Altitude;

import com.MAVLink.Messages.ardupilotmega.msg_mission_item;
import com.google.android.gms.maps.model.LatLng;

public abstract class LoiterInfiniteD extends LoiterD {

	public LoiterInfiniteD(MissionItemD item) {
		super(item);
	}

	public LoiterInfiniteD(Mission mission, LatLng coord, Altitude altitude) {
		super(mission, coord, altitude);
	}

	@Override
	public List<msg_mission_item> packMissionItem() {
		return super.packMissionItem();
	}

	@Override
	public void unpackMAVMessage(msg_mission_item mavMsg) {
		super.unpackMAVMessage(mavMsg);
	}

}