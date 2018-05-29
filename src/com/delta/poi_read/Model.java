package com.delta.poi_read;

import java.util.List;

public class Model {

    private List<StationBean> station;

    public List<StationBean> getStation() {
        return station;
    }

    public void setStation(List<StationBean> station) {
        this.station = station;
    }

    public static class StationBean {
        private List<String> range;

        public List<String> getRange() {
            return range;
        }

        public void setRange(List<String> range) {
            this.range = range;
        }
    }
}
