# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.69
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.statistic_read import StatisticRead

class TestStatisticRead(unittest.TestCase):
    """StatisticRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> StatisticRead:
        """Test StatisticRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `StatisticRead`
        """
        model = StatisticRead()
        if include_optional:
            return StatisticRead(
                request = [OFFER_PUBLISHED_AMOUNT, OFFER_PUBLISHED_COUNT],
                focus_on = '01ARZ3NDEKTSV4RRFFQ69G5FAV',
                focus_type = 'Organization',
                start_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                end_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                group_by_period = 'MONTHLY',
                data = [
                    tpdk_safe_checkout.models.statistic_read_data_inner.Statistic_Read_data_inner()
                    ]
            )
        else:
            return StatisticRead(
                request = [OFFER_PUBLISHED_AMOUNT, OFFER_PUBLISHED_COUNT],
        )
        """

    def testStatisticRead(self):
        """Test StatisticRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()