# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.54
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.api.webhook_api import WebhookApi


class TestWebhookApi(unittest.TestCase):
    """WebhookApi unit test stubs"""

    def setUp(self) -> None:
        self.api = WebhookApi()

    def tearDown(self) -> None:
        pass

    def test_api_webhook_histories_get_collection(self) -> None:
        """Test case for api_webhook_histories_get_collection

        Retrieves the collection of WebhookHistory resources.
        """
        pass

    def test_api_webhook_histories_id_get(self) -> None:
        """Test case for api_webhook_histories_id_get

        Retrieves a WebhookHistory resource.
        """
        pass

    def test_api_webhook_histories_id_put(self) -> None:
        """Test case for api_webhook_histories_id_put

        Replay a Webhook that ended up in failure
        """
        pass

    def test_api_webhook_subscriptions_get_collection(self) -> None:
        """Test case for api_webhook_subscriptions_get_collection

        Retrieves the collection of WebhookSubscription resources.
        """
        pass

    def test_api_webhook_subscriptions_id_delete(self) -> None:
        """Test case for api_webhook_subscriptions_id_delete

        Removes the WebhookSubscription resource.
        """
        pass

    def test_api_webhook_subscriptions_post(self) -> None:
        """Test case for api_webhook_subscriptions_post

        Subscribe to Event(s)
        """
        pass


if __name__ == '__main__':
    unittest.main()
