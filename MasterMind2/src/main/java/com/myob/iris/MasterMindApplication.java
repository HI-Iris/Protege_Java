package com.myob.iris;

import com.myob.iris.controller.*;

public class MasterMindApplication {

    public static void main(String[] args) {
        MasterMindService masterMindService = new MasterMindService();
        masterMindService.start();
    }
}
