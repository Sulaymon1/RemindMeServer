package com.sulaymon.remindme.server.repository;

import com.sulaymon.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sulaymon on 11.07.2017.
 */
public interface RemindRepository extends JpaRepository<Remind,Long>{
}
