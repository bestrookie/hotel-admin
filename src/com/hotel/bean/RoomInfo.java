package com.hotel.bean;

public class RoomInfo {
    private int roomId;
    private  String roomStart;
    private  String roomDescribe;
    private  String roomType;
    private  String pice;
    public RoomInfo(int roomId,String roomStart,String roomDescribe,String roomType){
            this.setRoomId(roomId);
            this.setRoomStart(roomStart);
            this.setRoomDescribe(roomDescribe);
            this.setRoomType(roomType);
    }
public RoomInfo(){

}

    public String getPice() {
        return pice;
    }

    public void setPice(String pice) {
        this.pice = pice;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomStart() {
        return roomStart;
    }

    public void setRoomStart(String roomStart) {
        this.roomStart = roomStart;
    }

    public String getRoomDescribe() {
        return roomDescribe;
    }

    public void setRoomDescribe(String roomDescribe) {
        this.roomDescribe = roomDescribe;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomTypeId) {
        this.roomType = roomTypeId;
    }

    @Override
    public String toString() {
        return
                roomId +
                "," + roomStart+
                "," + roomDescribe +
                "," + roomType +
                "," + pice;
    }
}
