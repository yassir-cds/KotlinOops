
# Schedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **kotlin.Long** | Gets or Sets Amount |  [optional]
**date** | **kotlin.String** | Gets or Sets Date |  [optional]
**rank** | **kotlin.Int** | Gets or Sets Rank |  [optional]
**currency** | [**inline**](#CurrencyEnum) | Gets or Sets Currency |  [optional]
**state** | [**inline**](#StateEnum) | State of the schedule |  [optional]
**capturedAmount** | **kotlin.Long** | Gets or Sets CapturedAmount |  [optional]
**remainingAmount** | **kotlin.Long** | Gets or Sets RemainingAmount |  [optional]
**cancelledAmount** | **kotlin.Long** | Gets or Sets CancelledAmount |  [optional]
**refundedAmount** | **kotlin.Long** | Gets or Sets RefundedAmount |  [optional]


<a name="CurrencyEnum"></a>
## Enum: currency
Name | Value
---- | -----
currency | unknown, aed, afn, all, amd, ang, aoa, ars, aud, awg, azn, bam, bbd, bdt, bgn, bhd, bif, bmd, bnd, bob, bov, brl, bsd, btn, bwp, byr, bzd, cad, cdf, che, chf, chw, clf, clp, cny, cop, cou, crc, cuc, cup, cve, czk, djf, dkk, dop, dzd, egp, ern, etb, eur, fjd, fkp, gbp, gel, ghs, gip, gmd, gnf, gtq, gyd, hkd, hnl, hrk, htg, huf, idr, ils, inr, iqd, irr, isk, jmd, jod, jpy, kes, kgs, khr, kmf, kpw, krw, kwd, kyd, kzt, lak, lbp, lkr, lrd, lsl, lyd, mad, mdl, mga, mkd, mmk, mnt, mop, mro, mur, mvr, mwk, mxn, mxv, myr, mzn, nad, ngn, nio, nok, npr, nzd, omr, pab, pen, pgk, php, pkr, pln, pyg, qar, ron, rsd, rub, rwf, sar, sbd, scr, sdg, sek, sgd, shp, sll, sos, srd, ssp, std, svc, syp, szl, thb, tjs, tmt, tnd, top, try, ttd, twd, tzs, uah, ugx, usd, usn, uyi, uyu, uzs, vef, vnd, vuv, wst, xaf, xag, xau, xba, xbb, xbc, xbd, xcd, xdr, xof, xpd, xpf, xpt, xsu, xts, xua, xxx, yer, zar, zmw, zwl


<a name="StateEnum"></a>
## Enum: state
Name | Value
---- | -----
state | init, inPayment, payed, confirmed, refused, cancelled, pending, undetermined, discarded, cashing, cashed



