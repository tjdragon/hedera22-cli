package org.tj.hedera22;

import com.hedera.hashgraph.sdk.AccountId;
import com.hedera.hashgraph.sdk.PrivateKey;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Accounts {
    public static final AccountId OPERATOR_ID = AccountId.fromString("0.0.7599");
    public static final PrivateKey OPERATOR_KEY = PrivateKey.fromString("302e020100300506032b657004220420022b3d9ca15b286bd45d172129436f307cd170e93352f1708364888694b6534b");

    public static final AccountId PARTICIPANT_1 = AccountId.fromString("0.0.34127055");
    public static final PrivateKey PARTICIPANT_1_KEY = PrivateKey.fromString("302e020100300506032b657004220420e6e703d3369c164f970440b65ffead59965599076c1cbc67221aac58a7555034");

    public static final AccountId PARTICIPANT_2 = AccountId.fromString("0.0.34127057");
    public static final PrivateKey PARTICIPANT_2_KEY = PrivateKey.fromString("302e020100300506032b657004220420cdbc300e0ea40a35e29fe06affeb601cf1c6d835be5dd236d0e91b9621f12654");

    public static final Map<AccountId, String> whoIs = new ConcurrentHashMap<>();

    static {
        whoIs.put(OPERATOR_ID, "Operator");
        whoIs.put(PARTICIPANT_1, "Participant 1");
        whoIs.put(PARTICIPANT_2, "Participant 2");
    }
}
