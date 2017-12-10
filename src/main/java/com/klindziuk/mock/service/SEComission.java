package com.klindziuk.mock.service;
import com.klindziuk.mock.model.Law;

import java.util.List;

/**
 * Created by Hp on 10/12/2017.
 */
public interface SEComission {
    List<Law> getLaws();
    boolean changeLaw();
    boolean addLaw();
    boolean removeLaw();

}
