package cn.ydsy.manager.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.function.Consumer;

@Component
public class TransactionUtils {
    @Autowired
    private PlatformTransactionManager transactionManager;

    public boolean transact(Consumer consumer) {
        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
        try {
            consumer.accept(null);

            transactionManager.commit(status);
            return true;

        } catch (Exception e) {
            transactionManager.rollback(status);
            e.printStackTrace();
            return false;
        }
    }
}

