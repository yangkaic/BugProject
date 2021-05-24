package com.training.bugApplication.service;

import com.training.bugApplication.entity.BugRequest;
import com.training.bugApplication.repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BugServiceImpl implements  BugService {

    @Autowired
    BugRepository bugRepository;

    @Transactional(rollbackOn = Exception.class, dontRollbackOn = {ArithmeticException.class,
            IllegalArgumentException.class})
    public void create(BugRequest bugRequest) throws Exception {
        System.out.println(bugRequest);
        //childMethod(bugRequest);
        bugRepository.save(bugRequest);
        //throw new Exception();
    }

//    @Transactional(value = Transactional.TxType.REQUIRES_NEW)
//    public void childMethod(BugRequest bugRequest) {
//        bugRepository.save(bugRequest);
//    }
}
