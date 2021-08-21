package com.sha.springbootbooksellermaven.service;

import com.sha.springbootbooksellermaven.model.PurchaseHistory;
import com.sha.springbootbooksellermaven.repository.projection.IPurchaseItem;

import java.util.List;

/**
 * @author sa
 * @date 3.07.2021
 * @time 18:14
 */
public interface IPurchaseHistoryService
{
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
