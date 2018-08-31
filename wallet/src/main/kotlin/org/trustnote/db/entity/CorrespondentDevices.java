package org.trustnote.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.lang.Integer;
import java.lang.String;

@Entity(
    tableName = "correspondent_devices"
)
public class CorrespondentDevices extends TBaseEntity {
  @ColumnInfo(
      name = "device_address"
  )
  @PrimaryKey
  @NonNull
  public String deviceAddress;

  @ColumnInfo(
      name = "name"
  )
  public String name;

  @ColumnInfo(
      name = "pubkey"
  )
  public String pubkey;

  @ColumnInfo(
      name = "hub"
  )
  public String hub;

  @ColumnInfo(
      name = "is_confirmed"
  )
  public int isConfirmed;

  @ColumnInfo(
      name = "is_indirect"
  )
  public int isIndirect;

  @ColumnInfo(
      name = "creation_date"
  )
  public long creationDate;

  @ColumnInfo(
      name = "my_record_pref"
  )
  public Integer myRecordPref;

  @ColumnInfo(
      name = "peer_record_pref"
  )
  public Integer peerRecordPref;

  @ColumnInfo(
          name = "last_message_creation_date"
  )
  public long updateDate;

  @ColumnInfo(
          name = "last_message"
  )
  public String lastMessage;

  @ColumnInfo(
          name = "unread_counter"
  )
  public long unReadMsgsCounter;

}
