/**
 * 
 */
package com.nereidarondon.jeep.service;

import java.util.List;
import com.nereidarondon.jeep.entity.Jeep;

/**
 * @author Nery
 *
 */
public interface JeepSalesService {

  List<Jeep> fetchJeeps(String model, String trim);

}
