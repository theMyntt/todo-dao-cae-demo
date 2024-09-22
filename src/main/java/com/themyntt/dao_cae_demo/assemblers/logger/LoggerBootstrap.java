package com.themyntt.dao_cae_demo.assemblers.logger;

import com.themyntt.dao_cae_demo.adapters.logger.LoggerAdapter;
import com.cae.loggers.IOLoggingMode;
import com.cae.loggers.LoggerProvider;
import com.cae.loggers.Logger;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LoggerBootstrap {

    public static void startupSettings(){
        LoggerProvider.SINGLETON
                .setProvidedInstance(LoggerAdapter.SINGLETON)
                .async(false)
                .setIOLoggingMode(IOLoggingMode.CAE_NATIVE)
                .structuredFormat(true)
                .setUseCasesLoggingIO(true)
                .setPortsLoggingIO(true);
    }

    public static void startupSettings(Logger logger){
        LoggerProvider.SINGLETON
                .setProvidedInstance(logger)
                .async(false)
                .setIOLoggingMode(IOLoggingMode.CAE_NATIVE)
                .structuredFormat(true)
                .setUseCasesLoggingIO(true)
                .setPortsLoggingIO(true);
    }

}
