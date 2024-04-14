package com.port.entity;


import lombok.Data;

@Data
public class DataUnit {
    private Integer id;
    private String atd;
    private String ata;
    private String voyage_state;
    private String reported_ETA;
    private String calculated_ETA;
    private String calculated_ETA_at;
    private String predictiveETD;
    private String reportedDestination;
    private String distanceTravelled;
    private String distance_togo;
    private String totalVoyage_distance;
    private String time_to_destination;
    private String draught;
    private String load_condition;
    private String speed_recorded;
    private Integer IMO;
    private String name;
    private String vessel_type_generic;
    private String vessel_type_getailed;
    private String navigational_status;
    private Integer MMSI;
    private String call_sign;
    private String flag;
    private String gross_tonnage;
    private String summer_DWT;
    private String length_overall_breadth_extreme;
    private String year_built;
    private String home_port;
    private String classification_society;
    private String builder;
    private String owner;
    private String manager;
    private String latest_position;
    private Float latitude;
    private Float longitude;
}

