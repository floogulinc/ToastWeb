package com.floogulinc.toastweb;

import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;
import jaci.openrio.toast.lib.module.ModuleConfig;

public class RobotModule extends IterativeModule {

    public static Logger logger;

    @Override
    public String getModuleName() {
        return "ToastWeb";
    }

    @Override
    public String getModuleVersion() {
        return "0.1.0";
    }
    
    @Override
    public void prestart() {
        
    }

    @Override
    public void robotInit() {
        logger = new Logger("ToastWeb", Logger.ATTR_DEFAULT);
        //TODO: Module Init
        WebHandler.init();
    }
}
