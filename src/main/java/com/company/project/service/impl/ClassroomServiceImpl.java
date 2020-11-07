package com.company.project.service.impl;

import com.company.project.dao.ClassroomMapper;
import com.company.project.model.Classroom;
import com.company.project.service.ClassroomService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/16.
 */
@Service
@Transactional
public class ClassroomServiceImpl extends AbstractService<Classroom> implements ClassroomService {
    @Resource
    private ClassroomMapper classroomMapper;

}
